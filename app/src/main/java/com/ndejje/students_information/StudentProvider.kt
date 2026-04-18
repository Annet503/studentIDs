package com.ndejje.students_information

data class Student(
    val id: Int,
    val name: String,
    val regNo: String,
    val course: String,
    val imageRes: Int,
    val isEnrolled: Boolean
)

class StudentProvider {
    companion object {
        val studentList = listOf(
            Student(1, "NAKKU ANNET", "24/2/314/D/01", "BIT", R.drawable.p1, true),
            Student(2, "NANTONGO ZAINAH", "24/2/314/D/02", "BCS", R.drawable.p2, false),
            Student(3, "NAMAZZI RITAH", "24/2/314/D/03", "BIT", R.drawable.p3, true),
            Student(4, "KASEKENDE ROBERT", "24/2/314/D/04", "BSE", R.drawable.p4, true)
        )
    }
}