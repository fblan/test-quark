import { error } from '@sveltejs/kit';
import type { PageLoad } from './$types';

export const load = (async({ params }) => {

    try{
    let helloworld=await fetch("/rest/hello/"+params.postid).then(response=>response.text()).catch(error=>{throw error});


        return {
            title: helloworld,
            content: 'Welcome to our blog. Lorem ipsum dolor sit amet...'
        };
    }catch(error){
        throw error;
    }


}) satisfies PageLoad;
