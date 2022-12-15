package assignment;
/* Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each
products */

class Furniture {
    String material;
    Furniture(String material) {
        this.material = material;
    }
}

class Chair extends Furniture {
    Chair(String material) {
        super(material);
    }
}

class Table extends Furniture {
    Table(String material) {
        super(material);
    }
}

class WoodenChair extends Chair {
    WoodenChair() {
        super("Wood");
    }
}

class WoodenTable extends Table {
    WoodenTable() {
        super("Wood");
    }
}

class MetalChair extends Chair {
    MetalChair() {
        super("Metal");
    }
}

class MetalTable extends Table {
    MetalTable() {
        super("Metal");
    }
}

class StressTest {
    void test(Furniture furniture) {
        if (furniture.material.equals("Wood")) {
            System.out.println("Wooden furniture is not suitable for stress test");
        } else {
            System.out.println("Metal furniture is suitable for stress test");
        }
    }
}

class FireTest {
    void test(Furniture furniture) {
        if (furniture.material.equals("Wood")) {
            System.out.println("Wooden furniture is suitable for fire test");
        } else {
            System.out.println("Metal furniture is not suitable for fire test");
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        StressTest stressTest = new StressTest();
        FireTest fireTest = new FireTest();
        WoodenChair woodenChair = new WoodenChair();
        WoodenTable woodenTable = new WoodenTable();
        MetalChair metalChair = new MetalChair();
        MetalTable metalTable = new MetalTable();
        stressTest.test(woodenChair);
        stressTest.test(woodenTable);
        stressTest.test(metalChair);
        stressTest.test(metalTable);
        fireTest.test(woodenChair);
        fireTest.test(woodenTable);
        fireTest.test(metalChair);
        fireTest.test(metalTable);
    }
}
