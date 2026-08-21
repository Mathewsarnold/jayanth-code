let formEl = document.querySelector('form');
let submmitBtn = document.querySelector('button');
let input = document.querySelector('input');
let userlist = document.querySelector('section');

let getUsers = async()=> {
    let response = await fetch('http://localhost:3000/user');
    let finalusers = await response.json();

    finalusers.map(user=> {
        let container = document.createElement('aside');
        let name = document.createElement('p');
        let deleteBtn = document.createElement('button');
        let editBtn = document.createElement('button');
        let buttonContainer = document.createElement('div');

        name.innerHTML = user.name;
        deleteBtn.innerHTML = "Delete";
        editBtn.innerHTML = "Edit";
        deleteBtn.className = "submit";
        editBtn.className = "submit";
        
        deleteBtn.addEventListener("click", ()=> {
            deleteUser(user.id);
        });
        editBtn.addEventListener("click", ()=> {
            editUser(user);
        });

        buttonContainer.append(editBtn, deleteBtn);
        container.append(name, buttonContainer);
        userlist.append(container);
    });
}
getUsers();

let createUser = async () => {
    await fetch('', {
        method: "POST",
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify({name: input.value})
    })
}

submmitBtn.addEventListener('click', ()=> {
    createUser();
});

let deleteUser = async (id) => {
    await fetch('', {
        method: 'DELETE'
    });
}

let editUser = (value) => {
    input.value = value.name;

    let updateBtn = document.createElement('button');
    updateBtn.innerHTML = "Update";
    updateBtn.className = "submit";

    updateBtn.addEventListener('click', ()=> {
        updateUser(value.id);
    });

    formEl.replaceChild(updateBtn, submmitBtn);
}

let updateUser = async (id) => {
    await fetch('', {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name: input.value})
    })
}