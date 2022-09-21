<template>

    <v-data-table
        :headers="headers"
        :items="orderHistrory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderHistroryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderHistrory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderHistrories'))

            temp.data._embedded.orderHistrories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderHistrory = temp.data._embedded.orderHistrories;
        },
        methods: {
        }
    }
</script>

