package com.crudjobs.crudjobs.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "jobs", catalog = "job_info")
    @SecondaryTable(name = "job_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "job_id"))
    public class Job {
        public Job(Long id, String title, String description, String location, int salary) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.location = location;
            this.salary = salary;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;
        private String description;

        @Column(table = "job_details")
        private String location;
        @Column(table = "job_details")
        private int salary;

        public Job() {
        }
    }
