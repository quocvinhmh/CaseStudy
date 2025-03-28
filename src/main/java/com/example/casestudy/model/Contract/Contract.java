package com.example.casestudy.model.Contract;


    public class Contract {
        private int id;
        private String startDate;
        private String endDate;
        private double deposit;
        private double totalMoney;
        private int customerId;

        public Contract() {}

        public Contract(int id, String startDate, String endDate, double deposit, double totalMoney, int customerId) {
            this.id = id;
            this.startDate = startDate;
            this.endDate = endDate;
            this.deposit = deposit;
            this.totalMoney = totalMoney;
            this.customerId = customerId;
        }

        public Contract(int id, String startDate, String endDate, int totalMoney, int customerId) {
            this.id = id;
            this.startDate = startDate;
            this.endDate = endDate;
            this.totalMoney = totalMoney;
            this.customerId = customerId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public double getTotalMoney() {
            return totalMoney;
        }

        public void setTotalMoney(double totalMoney) {
            this.totalMoney = totalMoney;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }
    }

