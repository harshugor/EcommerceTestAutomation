Feature: Customer Orders product from Website

@orderItem
Scenario: Customer add dress to cart and register the email and check out
Given customer is on homepage
When customer hovers on "Women"
And customer click on "Summer Dresses" button
And customer hover on "Printed Summer Dress" button
Then customer click on Quick view button
And customer can select size "S"
And customer click on Add to cart button
When customer click on "Continue shopping" button
Then customer hovers on Cart button
And customer click on "Check out" button
When customer click Proceed to checkout button
And customer can add email to register
And customer click on Create an account button
Then customer fills all mandatory fields
And customer click on Register button
When customer click Proceed to checkout button on Address page
Then customer selects agree to terms and service
When customer click Proceed to checkout button on Shipping page
And customer can verify the product description as "Printed Summer Dress"
And customer can verify product cost and total amount