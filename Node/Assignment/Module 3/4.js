User Collection: This collection stores information about the users of the app.

{
  "_id": ObjectId("user_id"),
  "username": "user123",
  "email": "user@example.com",
  "password": "hashed_password",
  "name": "John Doe",
  "address": "123 Main St, City, Country",
  "createdAt": ISODate("2024-05-03T10:00:00Z"),
  "updatedAt": ISODate("2024-05-03T10:00:00Z")
}

Product Category Collection: This collection contains information about different categories of products

{
  "_id": ObjectId("category_id"),
  "name": "Electronics",
  "description": "Electronic devices and gadgets",
  "createdAt": ISODate("2024-05-03T10:00:00Z"),
  "updatedAt": ISODate("2024-05-03T10:00:00Z")
}
Product Collection: This collection stores details about individual products.

{
  "_id": ObjectId("product_id"),
  "name": "Laptop",
  "description": "A high-performance laptop with the latest features",
  "category": ObjectId("category_id"),
  "price": 999.99,
  "stock": 100,
  "createdAt": ISODate("2024-05-03T10:00:00Z"),
  "updatedAt": ISODate("2024-05-03T10:00:00Z")
}

Order Collection: This collection tracks orders placed by users.
{
  "_id": ObjectId("order_id"),
  "user": ObjectId("user_id"),
  "products": [
    {
      "product": ObjectId("product_id"),
      "quantity": 2
    },
    {
      "product": ObjectId("product_id"),
      "quantity": 1
    }
  ],
  "totalPrice": 1999.97,
  "status": "Pending",
  "createdAt": ISODate("2024-05-03T10:00:00Z"),
  "updatedAt": ISODate("2024-05-03T10:00:00Z")
}

Review Collection: This collection contains user reviews for products.
{
  "_id": ObjectId("review_id"),
  "user": ObjectId("user_id"),
  "product": ObjectId("product_id"),
  "rating": 5,
  "comment": "Great product, highly recommended!",
  "createdAt": ISODate("2024-05-03T10:00:00Z"),
  "updatedAt": ISODate("2024-05-03T10:00:00Z")
}

