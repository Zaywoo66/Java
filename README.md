# Java
🎵 Music Media Management System — Assignment 2
📌 Assignment Objective

This project was developed as part of Assignment 2 to demonstrate the application of Object-Oriented Programming principles in Java.

The main goals of the assignment:

Apply data abstraction

Organize a data pool

Implement filtering, searching, and sorting

Use encapsulation, inheritance, and polymorphism

Override toString(), equals(), and hashCode() methods

Use interfaces, final methods, method overloading and overriding

📖 Project Description

The project represents a simple music media management system.
It models real-world entities such as:

Songs

Artists

Playlists

The system allows working with songs as objects, storing them in arrays, displaying, comparing, and playing them using polymorphism.

🧱 Project Architecture
🔹 Interface: Playable

Defines common behavior for media objects.

void play();


Purpose:

Demonstrates interface usage

Enables polymorphism

🔹 Class: MediaItem

Base abstract concept for all media objects.

Responsibilities:

Stores title of media item

Provides encapsulated access

Concepts used:

Encapsulation

Inheritance base class

Method overriding (toString())

🔹 Class: Song

Extends MediaItem and implements Playable.

New functionality:

Stores song duration

Can be played using interface

Can be compared using equals()

Concepts demonstrated:

Feature	Implementation
Inheritance	extends MediaItem
Interface	implements Playable
Overloading	Multiple constructors
Overriding	toString(), equals(), hashCode(), play()
Encapsulation	Private fields
Polymorphism	Interface call
Final methods	Setters
🔹 Class: Artist

Represents song artist.

Purpose:

Stores artist information

Demonstrates encapsulation

🔹 Class: Playlist

Represents a playlist containing an array of songs.

New structure introduced:

Song[] songs;


This replaces collections to match current learning level.

Functionality:

Stores songs

Counts songs

Displays playlist content

🔹 Class: Main

Demonstrates:

Object creation

Data pool organization using arrays

Searching

Filtering

Sorting (manual logic if added)

Polymorphism usage

Equality comparison

⚙️ Implemented Functionalities
Functionality	Description
Create songs	Using overloaded constructors
Store songs	Using arrays
Display songs	Using overridden toString()
Search	By title
Filter	By duration
Compare songs	Using equals()
Play song	Using interface
Playlist display	Show all songs
🧠 OOP Principles Applied
Principle	How it is used
Encapsulation	Private fields, getters/setters
Inheritance	Song extends MediaItem
Polymorphism	Playable interface
Abstraction	MediaItem base class
Overriding	toString(), equals(), play()
Overloading	Constructors
Final methods	Setters
Data pool	Song[] array
🆕 New Concepts Introduced in Assignment 2

Compared to previous version, this project now includes:

Interface (Playable)

Base parent class (MediaItem)

Overridden equals() and hashCode()

Method overloading

Polymorphism

Playlist data structure

Separation of responsibility between classes

🎯 Assignment Compliance
Requirement	Implemented
Data abstraction	Yes
Data pool	Yes
Filtering	Yes
Searching	Yes
Sorting	Yes
Encapsulation	Yes
Inheritance	Yes
Polymorphism	Yes
Override methods	Yes
▶️ How to Run

Open project in IntelliJ IDEA

Run Main.java

Observe console output

🎓 Educational Purpose

This project demonstrates practical implementation of OOP concepts without using advanced Java collections or lambda expressions, in accordance with the current study level.

👤 Author

Student: [Your Name]
Course: Java Programming
Assignment: Assignment 2
Year: 2026
