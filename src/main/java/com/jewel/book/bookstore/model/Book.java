package com.jewel.book.bookstore.model;

public class Book {
        private Long bookid;
        private String title;
        private String author;
        private String coverPhotoUrl;
        private Long isbnNumber;
        private Double price;
        private String language;

        public Long getBookid() {
                return bookid;
        }

        public void setBookid(Long bookid) {
                this.bookid = bookid;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public String getCoverPhotoUrl() {
                return coverPhotoUrl;
        }

        public void setCoverPhotoUrl(String coverPhotoUrl) {
                this.coverPhotoUrl = coverPhotoUrl;
        }

        public Long getIsbnNumber() {
                return isbnNumber;
        }

        public void setIsbnNumber(Long isbnNumber) {
                this.isbnNumber = isbnNumber;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public String getLanguage() {
                return language;
        }

        public void setLanguage(String language) {
                this.language = language;
        }
        
}
