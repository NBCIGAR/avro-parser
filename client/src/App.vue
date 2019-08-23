<template>
    <div id="app">
<!--        <Todos/>-->
        <AvroReader/>
     
    </div>
</template>

<script>
    import Todos from './components/Todos'
    import AvroReader from './components/AvroReader'
    // app Vue instance
    const app = {
        name: 'app',
        components: {
            Todos,
            AvroReader
        },
        // app initial state
        data: () => {
            return {}
        }
    }

    export default app
</script>

<style>
    [v-cloak] {
        display: none;
    }
</style>