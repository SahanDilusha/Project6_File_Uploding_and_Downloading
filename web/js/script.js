async function UploadFile() {
    const  file = document.getElementById("file").files[0];
    const  email = document.getElementById("email").value;

    console.log(file);
    console.log(email);

    const form = new FormData();
    form.append("email",email);
    form.append("file",file);
    
    const request = await fetch("Uploading",{method: "POST",body: form});
    
    if (request.ok){
        console.log("Success");
    }else{
        console.log("Error");
    }
    

}