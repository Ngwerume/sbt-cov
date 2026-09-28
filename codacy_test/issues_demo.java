package codacytest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class IssuesDemo {
    private static String password = "hunter2-codacy-test";
    private int unusedField;

    public ResultSet findUser(Connection conn, String name) throws Exception {
        Statement st = conn.createStatement();
        return st.executeQuery("SELECT * FROM users WHERE name = '" + name + "'");
    }

    public int classify(boolean a, boolean b, boolean c, boolean d) {
        if (a) {
            if (b) {
                if (c) {
                    if (d) { return 1; } else { return 2; }
                } else if (d) {
                    return 3;
                }
            } else if (c && d) {
                return 4;
            }
        }
        try {
            Thread.sleep(1);
        } catch (Exception e) {
        }
        return 0;
    }

    public double totalA(ArrayList<double[]> items) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i)[0] > 0) {
                total = total + items.get(i)[0] * items.get(i)[1];
            }
        }
        return total;
    }

    public double totalB(ArrayList<double[]> items) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i)[0] > 0) {
                total = total + items.get(i)[0] * items.get(i)[1];
            }
        }
        return total;
    }
}
