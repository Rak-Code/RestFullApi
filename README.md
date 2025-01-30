Sure! Here's a sample `README.md` for your project:

---

# E-Commerce Backend System - RESTful API

This project implements a simple E-Commerce backend system using Spring Boot. It exposes several endpoints for managing products in the system, such as adding, updating, retrieving, and deleting products.

## Features

- **CRUD operations** for managing products:
  - Create a new product
  - Read product details
  - Update existing product details
  - Delete a product

## Technologies Used

- **Java 11** (or later)
- **Spring Boot** for creating the RESTful API
- **Postman** (for testing the API)
- **In-memory data storage** (List of products)

## Endpoints

### 1. **Get all products**
- **Endpoint**: `/products`
- **Method**: `GET`
- **Description**: Fetches the list of all products in the system.
- **Response**: Returns a list of all products.

#### Example Request:
```
GET /products
```

#### Example Response:
```json
[
    {
        "id": 1,
        "name": "T-Shirt",
        "price": 19.99,
        "size": "M",
        "category": "Clothing"
    },
    {
        "id": 2,
        "name": "Jeans",
        "price": 49.99,
        "size": "L",
        "category": "Clothing"
    }
]
```

### 2. **Get product by ID**
- **Endpoint**: `/products/{id}`
- **Method**: `GET`
- **Description**: Fetches the details of a specific product by its `id`.
- **Path Variable**: `id` - The ID of the product to retrieve.
- **Response**: Returns the details of the requested product.

#### Example Request:
```
GET /products/1
```

#### Example Response:
```json
{
    "id": 1,
    "name": "T-Shirt",
    "price": 19.99,
    "size": "M",
    "category": "Clothing"
}
```

### 3. **Add a new product**
- **Endpoint**: `/products`
- **Method**: `POST`
- **Description**: Adds a new product to the system.
- **Request Body**: A `Product` object containing the product details.

#### Example Request:
```
POST /products
Content-Type: application/json

{
    "id": 3,
    "name": "Jacket",
    "price": 89.99,
    "size": "L",
    "category": "Clothing"
}
```

#### Example Response:
```json
{
    "id": 3,
    "name": "Jacket",
    "price": 89.99,
    "size": "L",
    "category": "Clothing"
}
```

### 4. **Update product by ID**
- **Endpoint**: `/products/{id}`
- **Method**: `PUT`
- **Description**: Updates an existing product’s details by its `id`.
- **Path Variable**: `id` - The ID of the product to update.
- **Request Body**: A `Product` object containing the updated product details.

#### Example Request:
```
PUT /products/1
Content-Type: application/json

{
    "id": 1,
    "name": "T-Shirt",
    "price": 22.99,
    "size": "M",
    "category": "Clothing"
}
```

#### Example Response:
```json
"Product updated successfully"
```

### 5. **Delete a product**
- **Endpoint**: `/products/{id}`
- **Method**: `DELETE`
- **Description**: Deletes a product from the system by its `id`.
- **Path Variable**: `id` - The ID of the product to delete.

#### Example Request:
```
DELETE /products/1
```

#### Example Response:
```json
"Product deleted successfully"
```

## Running the Application

### Prerequisites

1. Java 11 or later installed on your system.
2. Spring Boot dependencies are managed via Maven or Gradle.
3. You can run the application from your IDE or via the command line.

### Running from the Command Line

1. Clone the repository:
   ```
   git clone https://github.com/Rak-Code/e-commerce-backend.git
   ```
2. Navigate to the project directory.
3. Run the following command to start the application:
   ```
   ./mvnw spring-boot:run
   ```

### Testing the API

You can test the API endpoints using **Postman** or **cURL** by sending the corresponding HTTP requests mentioned above.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This `README` should provide clear guidance on how to use and test the API, as well as information on the application’s functionality and structure.
