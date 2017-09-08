Introduction: The flag project is to make a scalable and accurately 
measured image of the American flag.

My project: I fulfilled the specifications by creating 50 stars, 
a blue rectangle, and 13 red and white stripes. All of the components 
of my flag adjust (width, height, stars, stripes, rectangle, spacing)
when the window is dragged; thus, my flag is scalable. However, the 
measurements of the components of my flag are slightly off due to the
fact that I must round the values because fillRect() and fillPolygon()
only take integers as arguments. I may fix them by researching different
methods that can also draw shapes, but can be passed doubles as arguments
instead. Another problem is that some of the bottom red stripe is cut off by the
window. I also think that this is due to rounding errors, and I think I could
fix it by forcing the window height to round up.

My code structure: I start by setting the size of the window, and determining
the height and width of the flag by using the current size of the window. 
Then I use java graphics to draw the shapes. I separated the flag shapes into 
three different methods: stripes, rectangle, and stars. I based the size of 
each shape off of the width and height so that they are customizable. I made 
helper methods for the drawStars method.

Major challenges: My major challenge was drawing the stars. I struggled with finding
the correct equation to determine the star's coordinates, and also getting 
those coordinates in the correct order so that the fillPolygon method would
fill in the star correctly. After resolving that, another challenge I faced was
figuring out how to accurately adjust the height and width of the flag, depending
on whether the width or height of the screen was smaller.

Acknowledgments: I would like to thank Mr. Kuszmaul for giving the lecture on 
how to find star points using trigonometry. My fellow classmate Vivian Young also
helped me, and I referenced Stack Overflow to find out how to get the height and 
width of the window.
