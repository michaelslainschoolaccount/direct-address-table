# Direct Address Table

## Info

Author: Michael Slain <br>
Acknowledgements: Mr. Kuszmal

## Classes Outline

### Node

**Methods**

-   _constructor_
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** sets the default value of the key (`1`) and the default value of the value (`"bruh"`)
-   _constructor_
    -   **input:** the key (integer), the value (string)
    -   **output:** nothing
    -   **effect:** sets the key and value of the ndoe to what is provided by the input
-   getKey
    -   **input:** nothing
    -   **output:** integer
    -   **effect:** returns the key of the node
-   getValue
    -   **input:** nothing
    -   **output:** string
    -   **effect:** returns the value of the node
-   setKey
    -   **input:** the new key of the node (integer)
    -   **output:** nothing
    -   **effect:** sets the new key of the node
-   setValue
    -   **input:** the new value of the node (string)
    -   **output:** nothing
    -   **effect:** sets the new value of the node

### DirectAddressTable

**Methods**

-   _constructor_
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** sets the size of the table to the default value (10)
-   _constructor_
    -   **input:** the size of the table (integer)
    -   **output:** nothing
    -   **effect:** sets the size of the table to what is provided
-   getIndex
    -   **input:** index of the node (integer)
    -   **output:** the node (Node or null)
    -   **effect:** gets the node from the table at the index provided
-   insert
    -   **input:** the key (integer), the value (string)
    -   **output:** nothing
    -   **effect:** creates a new entry in the table with the provided key and value
-   delete
    -   **input:** the key of the node (integer)
    -   **output:** nothing
    -   **effect:** deletes the node that contains the key provided
-   search
    -   **input:** the key of the node (integer)
    -   **output:** the node (Node or null)
    -   **effect:** returns the node that contains the key provided
-   clear
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** clears the table, back to it's original state
