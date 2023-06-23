<script lang="ts">
    import type { PageData } from './$types';

    export let data: PageData;
</script>

<h1>{data.title}</h1>
<div>{@html data.content}</div>

<h3>test modification</h3>
<h4>je peux travailler en live</h4>
et ça c'est chouette, tres chouette et ça marche après 1 h?
et après 2h?

