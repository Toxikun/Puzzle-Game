
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Component;

public class scoresWindow {

    static JFrame frame = new JFrame();
    JScrollPane scrollPane = new JScrollPane();
    JTable table = new JTable();
    JButton closeBtn = new JButton("Close");
    JButton refreshBtn = new JButton("Refresh");
    ImageIcon pic = new ImageIcon("teduIcon.png");
    mainMenu mainMenu;
    JTableHeader Theader = table.getTableHeader();
    public static boolean open = false;
    DefaultTableModel model;

    public scoresWindow() {
        frame.setTitle("Score Table");
        frame.setIconImage(pic.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(100, 100, 451, 296);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(125, 240, 255));
        open = true;
        
        scrollPane.setBounds(10, 0, 415, 200);
        frame.add(scrollPane);

        scrollPane.setViewportView(table);
        table.setFont(new Font("Tahoma", Font.BOLD, 15));
        table.setEnabled(false);

        Theader.setBackground(new Color(218, 112, 214));
        Theader.setFont(new Font("Tahoma", Font.BOLD, 18));
        Theader.setEnabled(false);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe114", "root", "377TFLDoruk!");
            Statement st = con.createStatement();
            String query = "select * from player order by player";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(colName);
            String Player, Score;
            while (rs.next()) {
                Player = rs.getString(1);
                Score = rs.getString(2);
                String[] row = {Player, Score};
                model.addRow(row);
                
                if (Player.equals(LogSignInPage.nickName)) {
                    table.setRowSelectionInterval(model.getRowCount() - 1, model.getRowCount() - 1);
                    table.setSelectionBackground(Color.GREEN);
                }
            }
            st.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }

        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                open = false;
            }
        });
        closeBtn.setBackground(new Color(220, 20, 60));
        closeBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
        closeBtn.setBounds(265, 207, 115, 39);
        frame.add(closeBtn);

        refreshBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe114", "root", "377TFLDoruk!");
                    Statement st = con.createStatement();
                    String query = "select * from player order by player";
                    ResultSet rs = st.executeQuery(query);
                    ResultSetMetaData rsmd = rs.getMetaData();

                    int cols = rsmd.getColumnCount();
                    String[] colName = new String[cols];
                    for (int i = 0; i < cols; i++) {
                        colName[i] = rsmd.getColumnName(i + 1);
                    }
                    model.setColumnIdentifiers(colName);
                    String Player, Score;
                    while (rs.next()) {
                        Player = rs.getString(1);
                        Score = rs.getString(2);
                        String[] row = {Player, Score};
                        model.addRow(row);

                        if (Player.equals(LogSignInPage.nickName)) {
                            table.setRowSelectionInterval(model.getRowCount() - 1, model.getRowCount() - 1);
                            table.setSelectionBackground(Color.GREEN);
                        }
                    }
                    st.close();
                    con.close();

                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        refreshBtn.setBackground(new Color(60, 179, 113));
        refreshBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
        refreshBtn.setBounds(65, 207, 115, 39);
        frame.add(refreshBtn);

        CustomTableCellRenderer cellRenderer = new CustomTableCellRenderer(LogSignInPage.nickName, 0);

        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
    }

    class CustomTableCellRenderer extends DefaultTableCellRenderer {
        private String loggedInUser;
        private int nameColumnIndex;

        public CustomTableCellRenderer(String loggedInUser, int nameColumnIndex) {
            this.loggedInUser = loggedInUser;
            this.nameColumnIndex = nameColumnIndex;
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (column == nameColumnIndex) {
                String userName = (String) table.getValueAt(row, nameColumnIndex);
                if (userName != null && userName.equals(loggedInUser)) {
                    cellComponent.setBackground(Color.GREEN);
                } else {
                    cellComponent.setBackground(table.getBackground());
                }
            } else {
                cellComponent.setBackground(table.getBackground());
            }
            return cellComponent;
        }
    }
}