public class Test {
    private DirectAddressTable table;
    private int testAmount = 0, passedAmount = 0;

    public Test() {
        table = new DirectAddressTable();
    }

    public void runTests() {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();

        System.out.println(passedAmount + "/" + testAmount + " tests passed");
        if (testAmount != passedAmount)
            System.out.println("Congrats, you suck");
    }

    private void createTest(boolean criteria, String name) {
        System.out.println("Test " + ++testAmount);
        System.out.println("-- Name: " + name);
        table.clear();

        if (criteria) {
            System.out.println("-- Passed :D");
            System.out.println();
            passedAmount++;
            return;
        }

        System.out.println("-- Failed :(");
        System.out.println();
    }

    private void test1() {
        boolean criteria;

        try {
            table.insert(3, "bruh");
            Node node1 = table.getIndex(3);

            criteria = node1.getKey() == 3 && node1.getValue().equals("bruh");
        } catch (Exception e) {
            criteria = false;
        }

        createTest(criteria, "single `insert()`");
    }

    private void test2() {
        boolean criteria;

        try {
            table.insert(1, "chicken");
            table.insert(2, "bruh");
            table.insert(3, "ok");
            Node node1 = table.getIndex(1);
            Node node2 = table.getIndex(2);
            Node node3 = table.getIndex(3);

            criteria = node1.getKey() == 1 && node1.getValue().equals("chicken") && node2.getKey() == 2
                    && node2.getValue().equals("bruh") && node3.getKey() == 3 && node3.getValue().equals("ok");
        } catch (Exception e) {
            criteria = false;
        }

        createTest(criteria, "multiple `insert()`");

    }

    private void test3() {
        boolean criteria;

        try {
            table.insert(3, "bruh");
            table.delete(3);

            criteria = table.getIndex(3) == null;
        } catch (Exception e) {
            criteria = false;
        }

        createTest(criteria, "single `delete()`");
    }

    private void test4() {
        boolean criteria;

        try {
            table.insert(1, "chicken");
            table.insert(2, "bruh");
            table.insert(3, "ok");
            table.delete(1);
            table.delete(2);
            table.delete(3);

            criteria = table.getIndex(1) == null && table.getIndex(2) == null && table.getIndex(3) == null;

            createTest(criteria, "multiple `delete()`");
        } catch (Exception e) {
            criteria = false;
        }
    }

    private void test5() {
        boolean criteria;

        try {
            table.insert(3, "bruh");
            String value1 = table.search(3);

            criteria = value1.equals("bruh");

            createTest(criteria, "single `search()`");
        } catch (Exception e) {
            criteria = false;
        }
    }

    private void test6() {
        boolean criteria;

        try {
            table.insert(1, "chicken");
            table.insert(2, "bruh");
            table.insert(3, "ok");
            String value1 = table.search(1);
            String value2 = table.search(2);
            String value3 = table.search(3);

            criteria = value1.equals("chicken") && value2.equals("bruh") && value3.equals("ok");
        } catch (Exception e) {
            criteria = false;
        }

        createTest(criteria, "multiple `search()`");
    }
}
