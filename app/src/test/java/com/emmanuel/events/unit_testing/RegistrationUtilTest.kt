package com.emmanuel.events.unit_testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "12345",
            "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "patrova",
            "12345",
            "12345"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Henry",
            "12345",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Rand",
            "12345",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "user",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "username",
            "password1",
            "password1"
        )
        assertThat(result).isFalse()
    }

}