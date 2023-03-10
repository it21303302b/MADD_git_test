package com.example.tutorial04.model

class FormDat (private val studentID:String,
               private val year:String,
               private val semester:String,
               private val agreement: Boolean){

    fun validateStudentID():ValidationResult {

        return if (studentID.isEmpty()) {
            ValidationResult.Empty("Student Id is empty")
        } else if (!studentID.startsWith("IT")) {
            ValidationResult.Invalid("Should be starting with IT")
        } else if (studentID.length != 10) {
            ValidationResult.Invalid("Student ID shold have 10 characters")
        } else {
            ValidationResult.Valid
        }
    }
    fun validateYear():ValidationResult{

        return if(year.isEmpty())
        {
            ValidationResult.Empty("Year is empty")
        }
        else
        {
            ValidationResult.Valid
        }

    }



    fun validateSemester():ValidationResult{

        return if(semester.isEmpty())
        {
            ValidationResult.Empty("Semester is empty")
        }
        else
        {
            ValidationResult.Valid
        }

    }

    fun validateAgreement():ValidationResult{

        return if(!agreement)
        {
            ValidationResult.Empty("You must agree to the conditions")
        }
        else
        {
            ValidationResult.Valid
        }

    }
}