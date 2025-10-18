# 📝 Note-Taking App

A modern **Android Note-Taking App** built using **Kotlin**, following the **MVVM (Model–View–ViewModel)** architecture pattern.  
This app allows users to create, edit, delete, and search notes efficiently using **Room Database** and **Jetpack Compose** for a clean, responsive UI.

---

## 📱 Features

✅ Add, Edit, and Delete Notes  
✅ Real-time Search using Room Database queries  
✅ MVVM Architecture with ViewModel and LiveData  
✅ Jetpack Compose UI with Material 3 Design  
✅ Navigation Component for seamless screen transitions  
✅ Local data persistence with Room  
✅ Coroutine support for background operations  

---

## 🧠 Tech Stack

| Category | Technology |
|-----------|-------------|
| Language | Kotlin |
| Architecture | MVVM (Model–View–ViewModel) |
| UI | Jetpack Compose + Material3 |
| Database | Room (with LiveData & Coroutines) |
| Navigation | Jetpack Navigation Compose |
| Async | Kotlin Coroutines |
| IDE | Android Studio |

---

## 🗂️ Project Structure

```
com.example.notetakingapp/
├── data/
│   ├── dao/
│   ├── entity/
│   └── repository/
├── ui/
│   ├── screens/
│   ├── viewmodel/
│   └── components/
├── navigation/
│   └── NavGraph.kt
└── MainActivity.kt
```

---

## 🧩 Architecture Overview

The app is built using **MVVM**, which separates the UI from business logic:

- **Model:** Handles data using Room Database and entities.  
- **ViewModel:** Manages app logic and exposes data to the UI.  
- **View (Compose):** Displays notes and observes LiveData from the ViewModel.  

---

## 🔍 Room Search Example

```kotlin
@Query("SELECT * FROM notes WHERE title LIKE :searchQuery OR content LIKE :searchQuery")
fun searchNotes(searchQuery: String): LiveData<List<Note>>
```

This query updates results dynamically as the user types in the search bar.

---



## 🧠 What I Learned

- Implementing MVVM with Room and Compose  
- Writing custom Room queries for search functionality  
- Managing UI state with ViewModel and LiveData  
- Building responsive and modern UIs using Jetpack Compose  

---

## 📸 Screenshots

<img width="1077" height="583" alt="Screenshot 2025-10-18 205719" src="https://github.com/user-attachments/assets/40c155d5-f5d5-4031-b544-521cd0452cb8" />


---

## 💡 Future Improvements

- Add note categories or tags  
- Implement dark/light theme switching  
- Add cloud backup using Firebase  
- Support for images or voice notes  

---

## 🤝 Connect with Me

**Rishikesh Palkar**  
📍 Android Developer | Kotlin | MVVM | Compose  
🔗 [LinkedIn Profile](https://www.linkedin.com/)  
💻 [GitHub Profile](https://github.com/)  

---

⭐ If you like this project, don’t forget to give it a **star** on GitHub!
