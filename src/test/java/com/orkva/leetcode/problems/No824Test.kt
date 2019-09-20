package com.orkva.leetcode.problems

import org.junit.Test
import org.junit.Assert.*

class No824Test {

    @Test fun toGoatLatin() {
        val conditions = listOf(
                Pair("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
                Pair("The quick brown fox jumped over the lazy dog", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa")
        )
        val goatLatin = No824()
        for (condition in conditions) {
            assertEquals(condition.second, goatLatin.toGoatLatin(condition.first))
        }
    }

}