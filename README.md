# 🌌 star_generator: Panoramic Star Viewer

## 🎯 Project Focus and Value

This project is a Java application designed for rendering a panoramic star field. Its primary purpose is to showcase the practical implementation of the **Flyweight Design Pattern** for **efficient resource management** when handling a large quantity of similar objects (`Star` entities).

The repository includes a direct performance and memory consumption comparison between two distinct implementations:

* **Flyweight Version:** Uses the pattern to share intrinsic state and drastically minimize object instantiation.
* **Non-Flyweight Version:** Creates a unique instance for every single star generated, serving as the baseline for comparison.

## ⚙️ Key Technical Features

* Implementation and performance benchmarking of the **Flyweight Design Pattern**.
* Massive object generation and rendering controls (latitude/longitude boundaries).
* Simple Graphical User Interface (GUI) built with Java Swing/FX.

## 🚀 Execution and Benchmarking

To run the application and observe the performance difference:

### Prerequisites

* Java Development Kit (JDK) 8 or higher.

### Steps

1.  Clone the repository.
2.  Open the project in your preferred Java IDE (Eclipse/IntelliJ).
3.  Run the main classes to compare performance:
    * `LauncherFlyweight.java` (Optimized Version).
    * `LauncherNoFlyweight.java` (Baseline Comparison Version).
4.  Observe resource consumption and execution time between the two variants.

---
## Contribution & Contact

Contributions and feedback are welcome. Feel free to submit a Pull Request or contact the author directly via email for technical questions.

**Author:** Carlos Bermúdez
**Email:** carlosbermudezgalvan132@gmail.com
