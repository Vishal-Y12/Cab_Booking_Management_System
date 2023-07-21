<!DOCTYPE html>
<html>

<head>
    <style>
        body {
            font-size: 18px;
            line-height: 1.6;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            font-family: "Arial", sans-serif;
        }

        h1 {
            font-size: 36px;
            color: #F39C12;
            margin-bottom: 20px;
        }

        h2 {
            font-size: 30px;
            color: #27AE60;
            margin-bottom: 15px;
        }

        h3 {
            font-size: 24px;
            color: #3498DB;
            margin-bottom: 10px;
        }

        p {
            margin-bottom: 15px;
        }

        .emoji {
            font-size: 40px;
            margin-right: 10px;
            vertical-align: middle;
        }

        .highlight {
            background-color: #f9f9f9;
            padding: 10px;
            border-radius: 5px;
            margin-bottom: 20px;
        }

        .code {
            font-family: "Courier New", monospace;
            background-color: #f2f2f2;
            padding: 5px;
            border-radius: 5px;
            display: inline-block;
        }

        .center {
            text-align: center;
        }
    </style>
</head>

<body>
    <h1 class="center"><span class="emoji">🚕</span> Cab Booking Management System <span class="emoji">📅</span></h1>

    <p>
        The Cab Booking Management System is a Java-based application that simplifies cab booking and management
        operations. <span class="emoji">🚀</span> It empowers users to book intracity and intercity cabs, perform CRUD
        (Create, Read, Update, Delete) operations on customer profiles, check bills, and manage package bookings.
        <span class="emoji">💼</span>
    </p>

    <h2>Technologies Used <span class="emoji">🛠️</span></h2>

    <ul>
        <li><strong>Java</strong> ☕: The primary programming language for implementing the application's core logic.</li>
        <li><strong>MySQL</strong> 🗄️: The relational database management system used to store and manage data,
            including customer profiles, cab bookings, and billing details.</li>
        <li><strong>AWT (Abstract Window Toolkit)</strong> 🖌️: A Java API used to create graphical user interfaces
            (GUIs) for the application.</li>
        <li><strong>Swing Libraries</strong> 🎨: A set of Java GUI libraries that provide enhanced components and
            functionalities for creating rich and interactive graphical interfaces.</li>
        <li><strong>JDBC Connection</strong> 🔌: Java Database Connectivity for establishing connections between the
            application and the MySQL database.</li>
    </ul>

    <h2>Features <span class="emoji">🌟</span></h2>

    <ul>
        <li><strong>Customer Profile Management</strong> 🧑‍💼: Allows users to perform CRUD operations on customer
            profiles, adding new customers, viewing their details, updating information, and even deleting records.</li>
        <li><strong>Intracity Cab Booking</strong> 🚗: Users can seamlessly book cabs for travel within the city,
            specifying pickup and drop-off locations for a smooth ride.</li>
        <li><strong>Intercity Cab Booking</strong> 🛣️: Enables users to book cabs for travel between cities, specifying
            pickup and destination cities for a convenient journey.</li>
        <li><strong>View Booked Cabs</strong> 👀: Provides an overview of all booked cabs, including their details and
            booking status for easy tracking.</li>
        <li><strong>Update Customer Details</strong> ✏️: Offers a user-friendly way to update customer information in
            the database, ensuring accurate records.</li>
        <li><strong>Package Booking</strong> 📦: Facilitates users to book packages for a fixed duration, encompassing
            multiple cab rides and additional amenities for a hassle-free trip.</li>
        <li><strong>View Booked Packages</strong> 👁️: Allows users to view all booked packages and their details at a
            glance.</li>
        <li><strong>Bill Management</strong> 💰: Enables efficient bill generation for cab bookings and packages,
            calculating fare and additional charges in a snap.</li>
    </ul>

    <h2>Installation and Usage <span class="emoji">🛠️</span></h2>

    <p>
        To run the Cab Booking Management System application, follow these simple steps:
    </p>

    <ol>
        <li>Install Java and MySQL on your system if not already installed.</li>
        <li>Create a MySQL database and import the provided SQL schema to set up the necessary tables.</li>
        <li>Update the database connection details (URL, username, and password) in the Java code.</li>
        <li>Compile and run the <span class="code">HomePage.java</span> file, which serves as the entry point for the
            application.</li>
