package com.emmanuel.events.unit_testing

object RegistrationUtil {
    /*
    --- The input is not valid if
    ... the password/username is empty
    ... the username is already taken
    ... the confirmed password is not equal to the real password
    ... the password contained less than three (3) digits
 */
    private val existingUsers = listOf("Emmanuel", "Henry", "Nathan", "Stephan", "Bright", "Eric")
    fun validateRegistrationInput(username:String, password: String, confirmPassword:String) : Boolean{
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(username in existingUsers){
            return false
        }
        if(password != confirmPassword){
            return false
        }
        if(password.count { it.isDigit() } < 3){
            return false
        }
        return true
    }
}