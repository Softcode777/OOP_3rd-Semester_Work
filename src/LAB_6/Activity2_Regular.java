package LAB_6;
    public class Activity2_Regular extends Activity2_Employee {
        private int basicPay;

        public Activity2_Regular(String name, String phone, String address, int allowance, int basicPay) {
            super(name, phone, address, allowance);
            this.basicPay = basicPay;
        }
        public void Display(){
            System.out.println("Name: " + name + "Phone Number: " + phone
                    +"Address: " + address + "Allowance: " + allowance + "Basic Pay: "
                    + basicPay);
        }
    }

