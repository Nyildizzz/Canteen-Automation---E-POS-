# Cafeteria Automation

This project is a Java application aimed at developing an automation system for a cafeteria. Users can select products, place orders, and manage student information.

![Cafeteria Automation](https://ibb.co/vZF0XbQ)

## Features

- Ability for users to select products and add them to their carts.
- Users can place orders for the selected products.
- Admin panel to add, edit, and delete products.
- Viewing and managing student information.

## Requirements

- Java JDK 8 or newer version
- MySQL database
- Java Swing library

## Installation

1. Clone this repository to your computer:

```bash
git clone https://github.com/Username/cafeteria-automation.git
```

2. Create a new database named "cafeteria" in your MySQL database.

3. Update the database connection settings:

   File: `src/main/resources/config.properties`

   ```properties
   db.url=jdbc:mysql://localhost:3306/cafeteria
   db.username=username
   db.password=password
   ```

4. Navigate to the project folder and compile the application:

```bash
cd cafeteria-automation
javac -cp "lib/*" src/main/java/*.java
```

5. Start the application:

```bash
java -cp "lib/*:src/main/java" Main
```

## Usage

- Upon starting the application, you can log in to view student information and products.
- Use the "Add to Cart" buttons in the interface to select products.
- Confirm your order when you're done.

## Contributions

Pull requests are welcome. Please discuss major changes in the "Discussion" section before making them.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.
