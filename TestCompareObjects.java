
    public class TestCompareObjects {
        private String name;
        private int age;
    
        public TestCompareObjects(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            TestCompareObjects person = (TestCompareObjects) obj;
            return age == person.age && name.equals(person.name);
        }
    
        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + age;
            return result;
        }
    
        public static void main(String[] args) {
            TestCompareObjects person1 = new TestCompareObjects("Alice", 30);
            TestCompareObjects person2 = new TestCompareObjects("Alice", 30);
            TestCompareObjects person3 = new TestCompareObjects("Bob", 25);
    
            System.out.println("person1 equals person2: " + person1.equals(person2));
            System.out.println("person1 equals person3: " + person1.equals(person3));
        }
    }

