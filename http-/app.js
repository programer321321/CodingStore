import express from 'express';

const store = express();
store.listen(3000);
store.use(express.json());

store.get('/buy.com', (req, res) => {
    res.sendFile('E:\\WebstormProjects\\http-\\index.html');
});
store.get('/', (req, res) => {
    res.sendFile('E:\\WebstormProjects\\http-\\web.html');
});