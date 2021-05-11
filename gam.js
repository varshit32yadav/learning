const game=()=>{
    let pscore=0;
    let cscore=0;
    const startGame=()=>{
        const playbtn=document.querySelector("#bt");
        const introscreen=document.querySelector(".start");
        const match=document.querySelector(".match");
        playbtn.addEventListener("click",()=>{
            introscreen.classList.add("fadeout");
            match.style.margin-bottom ="50px";

        });
    };
    //is to call the inner functions
    startGame();
};
//start the game function
game();
