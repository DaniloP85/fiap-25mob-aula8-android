package com.fiap.aula8

import androidx.annotation.DisplayContext
import org.junit.Assert.*
import org.junit.Test

class UtilKtTest {

    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", alturaTxt = "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun testGetResult_embranco_aviso() {
        val semPeso = getImcResult("", "1.80")
        assertEquals(semPeso.result, Result.BLANK)

        val semAltura = getImcResult("90", "")
        assertEquals(semAltura.result, Result.BLANK)
    }
}