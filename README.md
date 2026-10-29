# Top 3 Students Ranking in Java

Hey there! This is a quick Java program I put together for a class exercise to find and display the top 3 students based on their grades.

---

## How it Works

* **Parallel Arrays:** We use two simple arrays—one for student names (`String[]`) and another for their corresponding grades (`double[]`). The positions match up (index `0` is the first student's name and grade, index `1` is the second, and so on).
* **Partial Selection Sort:** Instead of sorting the entire array, the code only loops 3 times to find the top 3 highest scores and pushes them to the front. 
* **Data Swapping:** Every time a grade moves up in the ranking, the student's name moves right along with it so nothing gets mixed up!

---
