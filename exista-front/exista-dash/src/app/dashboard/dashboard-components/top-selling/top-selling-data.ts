export interface Product {
    image: string,
    uname: string,
    gmail: string,
    fone: string,
    dateOfBirth: string,
    registrationDate: string,
    city: string
}

export const TopSelling: Product[] = [

    {
        image: "assets/images/users/user1.jpg",
        uname: "Carlos Silva",
        gmail: "carlos.silva@gmail.com",
        fone: "(11) 1234-5678",
        dateOfBirth: "1985-05-15",
        registrationDate: "2020-01-10",
        city: "São Paulo"
    },
    {
        image: "assets/images/users/user2.jpg",
        uname: "Ana Souza",
        gmail: "ana.souza@hotmail.com",
        fone: "(21) 2345-6789",
        dateOfBirth: "1990-08-25",
        registrationDate: "2021-03-15",
        city: "Rio de Janeiro"
    },
    {
        image: "assets/images/users/user3.jpg",
        uname: "João Oliveira",
        gmail: "joao.oliveira@yahoo.com",
        fone: "(31) 3456-7890",
        dateOfBirth: "1982-11-30",
        registrationDate: "2019-07-22",
        city: "Belo Horizonte"
    },
    {
        image: "assets/images/users/user4.jpg",
        uname: "Mariana Lima",
        gmail: "mariana.lima@outlook.com",
        fone: "(41) 4567-8901",
        dateOfBirth: "1995-02-14",
        registrationDate: "2020-11-05",
        city: "Curitiba"
    },

]
