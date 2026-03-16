# 🧪 Lab Group Generator

A lightweight, efficient Java application designed to help educators randomly assign students into balanced lab groups or project teams. 

## 📖 Overview

As a Computer Science teacher, I frequently need to split my class into random groups for pair programming and lab assignments. Doing this manually is time-consuming and often leads to the same students working together. 

This tool takes a standard class roster, shuffles the students using Java's built-in `Collections` library, and outputs neatly formatted groups of a specified size.

## ✨ Features

* **True Randomization:** Utilizes `Collections.shuffle()` to ensure unbiased group generation every time the program is run.
* **Dynamic Group Sizing:** Automatically handles remainder students (e.g., if you have 20 students and want groups of 3, it safely handles the remaining 2 students without throwing an `IndexOutOfBoundsException`).
* **Zero Dependencies:** Written in standard core Java. No external libraries or frameworks required.

## 🚀 How to Use

### Prerequisites
You will need to have the Java Development Kit (JDK) installed on your machine. You can verify this by opening your terminal or command prompt and typing:
`java -version`

### Running the Program

1. **Clone or Download** this repository to your local machine.
2. Open the `LabGroupGenerator.java` file in any text editor or IDE and update the `roster` list with your actual students' names.
3. Update the `groupSize` integer to your desired number of students per group.
4. **Compile the code** by running the following command in your terminal:
   ```bash
   javac LabGroupGenerator.java
   ```
5. **Run the program**
   ```bash
   java LabGroupGenerator
   ```

## 💻 Example Output
```plaintext
--- Random Lab Groups ---

Group 1:
- Charlie
- Alice
- Fiona

Group 2:
- Bob
- Ethan
- Diana

Group 3:
- Hannah
- George
```
## 🎓 Educational Note
*This repository is maintained as part of a demonstration for my Computer Science students to showcase practical applications of Java Lists, standard algorithms, and professional documentation.*
