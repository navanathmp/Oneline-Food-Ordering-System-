let cart = [];
let total = 0;

function addToCart(name, price){
    cart.push({name, price});
    total += price;

    let list = document.getElementById("cart");
    let li = document.createElement("li");
    li.innerText = name + " - ₹" + price;
    list.appendChild(li);

    document.getElementById("total").innerText = "Total: ₹" + total;
}

function placeOrder(){
    if(cart.length === 0){
        alert("Cart is empty!");
        return;
    }

    alert("Order placed successfully!");
    cart = [];
    total = 0;

    document.getElementById("cart").innerHTML = "";
    document.getElementById("total").innerText = "Total: ₹0";
}
