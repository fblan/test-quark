import { sveltekit } from '@sveltejs/kit/vite';
import { defineConfig } from 'vite';


export default defineConfig({
	plugins: [sveltekit()],
	/*server:{
		proxy: {
			// string shorthand: http://localhost:5173/foo -> http://localhost:4567/foo
			'/rest':{
				target:"http://127.0.0.1:8080"
			},

		}
	}*/
});
