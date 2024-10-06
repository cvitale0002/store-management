# store-management
my store-management system
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.
![alt text](https://github.com/cvitale0002/store-management/blob/main/Screen%20Shot%202024-10-06%20at%2012.33.49%20PM.png)

## Description
Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

My project is a toy store selling a kid's dream of toys. I chose to make a toy store because as a child, I loved the thrill of getting the reward to be able to pick some toys to take home. My store sells, BeanieBoos, Lego Flowers, Dolls, and a multitude of Plushies. The best part about my store is that all my toys cost the same price because they all do the same thing for each child. My superclass, or my toy catalog allows people to see the price, type, and size of the toys. The subclasses connect the legos and bears to my main page, or the catalog. I represented the item from the store by using the keyword "this" to connect the instance variables or the price, size, and type to the toys themselves. When someone buys a toy, it returns the traits and the item itself so we can see each unique thing about it. After the item is returned, the toString allows us to see the objects description in a sentence form for each object.