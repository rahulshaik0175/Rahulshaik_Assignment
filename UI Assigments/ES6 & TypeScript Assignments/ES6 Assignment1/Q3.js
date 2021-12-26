// Object.assign(): used to clone the properties

let order = {
    id : '9',
    title : "phone",
    price : 30000,
    printOrder: function () {
        alert(`Oder Details are: \n Id: ${this.id} \n Title: ${this.title} \n Price: ${this.price}`);
    },
    getPrice: function () {
        alert(`Price is: ${this.price}`);
    }
};

let myOrder =  Object.assign({}, order);
console.log(myOrder);