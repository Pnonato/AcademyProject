package br.com.deoo.gym.deoo_gym.entity;

public class PhysicalCharacteristics {

        private User user;
        private double weight;
        private double height;
        private String gender;
        private String physicalGoal; // Sugerível enum
        private double IMC;


        public PhysicalCharacteristics(User user, double weight, double height, String gender, String physicalGoal, double IMC) {
            this.user = user;
            this.weight = weight;
            this.height = height;
            this.gender = gender;
            this.physicalGoal = physicalGoal;
            this.IMC = IMC;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public double getWidth() {
            return weight;
        }

        public void setWidth(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getPhysicalGoal() {
            return physicalGoal;
        }

        public void setPhysicalGoal(String physicalGoal) {
            this.physicalGoal = physicalGoal;
        }

        public double getIMC() {
            return IMC;
        }

        public void setIMC(double IMC) {
            this.IMC = IMC;
        }
}

