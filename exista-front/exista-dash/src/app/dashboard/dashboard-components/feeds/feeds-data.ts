export interface Feed {
    class: string,
    icon: string,
    task: string,

}

export const Feeds: Feed[] = [

    {
        class: 'bg-info',
        icon: 'bi bi-bell',
        task: 'Loja do João',

    },
    {
        class: 'bg-success',
        icon: 'bi bi-hdd',
        task: 'Supermercado Silva',

    },
    {
        class: 'bg-warning',
        icon: 'bi bi-bag-check',
        task: 'Padaria Pão Doce',

    },
    {
        class: 'bg-danger',
        icon: 'bi bi-person',
        task: 'Eletrônicos Tech',

    },
    {
        class: 'bg-primary',
        icon: 'bi bi-person',
        task: 'Livraria do Saber',

    },

]
