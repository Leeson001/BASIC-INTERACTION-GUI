[README (1).md](https://github.com/user-attachments/files/33482562/README.1.md)
# Java Swing Assignment: Basic Interactive GUI

**Module:** PROG209 – Event Driven Programming
**Assignment:** Individual Assignment 1 (10%)
**Student:** ALPHA USMAN JALLOH
**Student ID:** 905005323
**Examiner:** Amandus Benjamin Coker
**Institution:** Limkokwing University of Creative Technology, Sierra Leone

---

## 📌 About the Project

This is a simple desktop GUI application built with **Java Swing**. It opens an 800x800 window that shows a welcome message. Two buttons let the user change the label text and the panel background colour.

The project demonstrates:

- `JFrame`, `JPanel` and `JLabel`
- **Inheritance** (`CustomFrame extends JFrame`)
- **Constructors**
- `ImageIcon` for a custom application icon
- **Event handling** with `ActionListener`

---

## ✨ Features

- Window titled **"Java Swing Assignment"**, sized **800 x 800** pixels
- Welcome label: *"Welcome to Java Swing First Individual Assignment by Alpha Usman Jalloh"*
- Custom bundled application icon loaded with `ImageIcon` for the window and welcome label
- Application exits when the close button is clicked
- **Change Text** button cycles through different messages
- **Change Background** button cycles through different panel colours

---

## 🗂️ Project Structure

```
.
├── SwingAssignment.java     # Main source code
├── icon.png                 # Application icon
├── wireframe.png            # Wireframe exported from Figma
├── wireframe.svg            # Editable wireframe source
├── screenshots/             # Screenshots of the running app
└── README.md                # Project documentation
```

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or higher
- Any IDE (IntelliJ IDEA or VS Code) or a terminal

Check your Java version:

```bash
java -version
```

---

## ▶️ How to Run

### Option 1: IDE (IntelliJ IDEA / VS Code)

1. Clone or download this repository.
2. Open the folder as a project.
3. Keep `icon.png` on the application's classpath (in the project root when running from the terminal).
4. Run `SwingAssignment.java`.

### Option 2: Terminal

```bash
git clone <your-repository-link>
cd <repository-folder>
javac SwingAssignment.java
java SwingAssignment
```

> The custom icon is loaded as a classpath resource, so it works independently of the current working directory as long as `icon.png` is included on the classpath.

---

## 🧠 How the Code Works

| Part | What it does |
|------|--------------|
| `CustomFrame extends JFrame` | Inheritance: reuses all JFrame features and adds our own settings |
| `CustomFrame` constructor | Sets the title, size, close behaviour, screen position and icon |
| `SwingAssignment` constructor | Builds the interface: creates `frame`, `panel`, `label` and the buttons |
| `ImageIcon` | Loads the bundled `icon.png` resource and applies it to the window and welcome label |
| `ActionListener` | Runs code when a button is clicked (changes text or background) |
| `SwingUtilities.invokeLater` | Starts the GUI safely on the Event Dispatch Thread |

---

## 🎨 Wireframe

The interface was designed in **Figma** before coding.

![Wireframe](wireframe.png)

---

## 🖼️ Screenshots

| Start-up | After "Change Text" | After "Change Background" |
|----------|---------------------|---------------------------|
| ![Start](screenshots/start.png) | ![Text](screenshots/text.png) | ![Background](screenshots/background.png) |

---

## 📚 References

- Oracle, *The Java Tutorials: Creating a GUI with Swing* – https://docs.oracle.com/javase/tutorial/uiswing/

---

## 👤 Author

**ALPHA USMAN JALLOH**
Bachelor of Information Technology, Limkokwing University of Creative Technology, Sierra Leone

> This project was completed for academic purposes in line with the university's policies on academic integrity.
