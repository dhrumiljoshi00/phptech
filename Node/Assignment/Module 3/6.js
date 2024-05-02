db.product.updateOne(
  { _id: ObjectId("product_id") }, // Specify the filter criteria for the particular product
  { $set: { price: newPrice } }    // Update the price to the new value
)
