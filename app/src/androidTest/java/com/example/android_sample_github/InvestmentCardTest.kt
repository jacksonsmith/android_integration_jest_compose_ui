package com.example.android_sample_github

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test

class InvestmentCardTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun investmentCardDisplaysCorrectInfo() {
        // setup
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Earnings: $0.09",
                amount = "$11.52",
                date = "IN 2 DAYS"
            )
        }
        // assert
        composeTestRule.onNodeWithText("MXRF11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Earnings: $0.09").assertIsDisplayed()
        composeTestRule.onNodeWithText("$11.52").assertIsDisplayed()
        composeTestRule.onNodeWithText("IN 2 DAYS").assertIsDisplayed()
    }
}
