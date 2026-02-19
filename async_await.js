function getData() {
    return new Promise((resolve,reject)  => {
        setTimeout(() => {
resolve("Data received");
        }, 2000);
        });
    }



async function showData() {
    console.log("Fetching data..");

    const result = await getData();
    console.log(result)
    console.log("completed");
    console.log("completed143");

}
showData();
async function sayhii() {
    return"hello";
}
async function showMessage() {
    const message = await sayhii();
    console.log(message);
}
showMessage();