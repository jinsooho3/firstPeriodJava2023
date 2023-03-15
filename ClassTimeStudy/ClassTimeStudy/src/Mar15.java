import java.time.LocalDate;

public class Mar15 {

    private String name;
        private int birthYear;

        public void setName(String name) {
            this.name = name;
        }
        public void setBirthYear(int birthYear){
            if(birthYear>=1900){
                this.birthYear = birthYear;
                return;
            }
        }

        public String getName () {
            return name;
        }

        public int getAge() {
            LocalDate d = LocalDate.now();
            int tYear = d.getYear();
            return tYear - birthYear + 1;
        }
}
