package ua.myhospital.core;

public class Constant {
    public  enum Role {
        ADMIN("A"),
        PATIENT("P"),
        DOCTOR("D"),
        UNKNOWN("U");

        private String code;

        public String getCode() {
            return code;
        }

        Role(String code) {
            this.code = code;
        }

        /**
         * Пробігає в циклі по всім енумчикам і шукає той, в кого code збігається з параметром code
         *
         * @param code
         * @return
         */
        public static Role getByCode(String code) {
            for (Role value : values()) {
                if (value.getCode().equals(code)) {
                    return value;
                }
            }

            return null;
        }
    }
}
