import { test, expect } from '@playwright/test';

test('keyboard action demo', async ({page}) => {
    await page.goto('https://textbox.johnjago.com/');
    await page.locator("//textarea").pressSequentially("Latha TCS Employee ",{delay:200});
    await page.locator("//textarea").press("Control+A");
    await page.locator("//textarea").press("Backspace");

    


    await page.keyboard.type("Hello world");
    await page.keyboard.press("ArrowLeft");
    await page.keyboard.down("Shift");
    for(let i=0;i<'world'.length;i++)
        await page.keyboard.press('ArrowLeft');
    await page.keyboard.down('Shift');

    await page.keyboard.press('Backspace');

})

    




