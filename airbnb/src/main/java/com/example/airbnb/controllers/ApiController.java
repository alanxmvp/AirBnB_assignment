package com.example.airbnb.controllers;

import com.example.airbnb.entities.AirBnBProperty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
  @GetMapping(path = "/", produces = "application/json")
  public AirBnBProperty[] showJson() {
    AirBnBProperty[] AirBnBProperty = { new AirBnBProperty(3708776, "p3_1561105479_S1mfpJNwih9%2F1VNs",
        "Chic Room with Bath and Kitchenette Living Area",
        "https://a0.muscache.com/4ea/air/v2/pictures/d5e090ac-b2b6-4f9e-a578-3d9405c8477f.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
        3, 1, 1, 1,
        "Enjoy the central location and easy accessibility to public transit from this stylish, ground floor studio. Inside the private room, admire details like the full-height mural, complete mosaic bathroom, and soft, woven textiles maximising comfort.",
        "Nicholas & Michele", 17,
        "https://a0.muscache.com/im/pictures/5b672d57-4564-4690-9600-0ac9b40c562e.jpg?aki_policy=x_medium",
        "https://a0.muscache.com/im/pictures/46bc761d-ab43-426f-b289-f0916215e466.jpg?aki_policy=x_medium",
        "https://a0.muscache.com/im/pictures/8eff0f5c-8c25-4658-8f95-e437df0f59b3.jpg?aki_policy=x_medium",
        "https://a0.muscache.com/im/pictures/9a7751c9-8dd2-4882-b9fc-130082a0f468.jpg?aki_policy=x_medium", 15,
        "Self check-in", "Kitchenette", "Wifi", "TV", "Bathroom essentials", "Bedroom comforts", "Coffee maker",
        "Hair dryer", "Iron", "Heating", "Air conditioning", "Carbon monoxide detector", "Flat path to guest entrance",
        "The studio is situated under the owners' raised first floor apartment, so it's very private. It's located in Camberwell New Road, a vibrant, artistic area with a choice of cafes, markets, and transport links—all just a short walk away.",
        "Heathrow Airport", "44 mins by car without traffic", 257, "Tabatha",
        "Very convenient location. It was easy to get around and enjoy the city.", "Thomas",
        "I was impressed by this place. It’s in a great location. It’s located within 2 minutes of a small grocery store, laundry mat, bus stop, and cafe. You can reach all of the major sites in London less than 30 minutes by bus and underground tube. Really easy to get around from this location",
        "Nancy",
        "A great place to stay while visiting London! Convenient to transit to get to the center quickly, but a quiet, restful place to come back to. The apartment is comfortable, stylish, and as described. Nicholas was available, responsive, and helpful.",
        "Cary",
        "I had high expectations for this place and I was not disappointed. Nicholas and Michele were friendly and responsive hosts. The apartment is well-appointed, and the station is a bit of a walk (10 minutes) but I personally enjoyed being in a neighborhood that had a chiller vibe than central London. A 30-minute tube or bus ride gets you to pretty much any place you would want to be in the city! I would book this location again.",
        "Manuela",
        "The Airbnb is everything and more! It has the best of amenities and is a 10 minute walk from the oval station that can take you anywhere in London. It is also a 2 minute walk from a bus stop that is very well connected. There is also a co-op market around the block that is great to pick up small things or to even full meals to cook in the well stocked kitchen. We spent about 8 days at the Airbnb and we all felt like it enhanced our experience while in London for the first time. Would recommend this to anyone wanting to be near the center of London and want to feel comfortable through out the entire stay. Sometimes hotels feel cold and empty but that’s not something you would encounter with this home.",
        "Dawn",
        "You will love Nicholas and Michele’s modern apartment. It has everything you need to make your trip a memorable one. We were so pleased that there was a grocery store around the corner and we were close to the underground. Nicolas and Michele are wonderful hosts who were always available to answer all our silly questions.",
        "Artist from London and interior designer. I am English/German and my partner is Italian. I have been living in London for over 18 years so can always point you in the right direction if you need any ideas. Although London at first seems a bit vast it's surprising how much you can cover on foot or bicycle without being entirely exhausted and I can help you get the most out of a first visit with ideas on what to see and do.",
        "Your host will be on the property and have shared use of common areas. They’ll be available for anything you need during your stay.",
        "May 2013", "English, Deutsch", "100%", "within an hour",
        "General rules Not suitable for infants (under 2 years) No smoking No pets No parties or events Check-in time is 2PM - 11PM Check out by 11AM Self check-in with keypad From your host Please note that the calendar is always up to date and only those dates shown as 'available' can be reserved. Please avoid asking for alternative dates in reservation requests. You must also acknowledge Security Deposit - if you damage the home, you may be charged up to RM924",
        "Moderate Free cancellation for 48 hours After that, cancel up to 5 days before check-in and get a full refund, minus the service fee.",
        "Cosy, Enchanting Coach House in Telegraph Hill", 342, 5, 174,
        "Unwind Under the Pergola of a Bright Garden Flat", 606, 5, 202, "Highbury Garden House - King Room", 443, 5,
        225, "Sip Tea at a Stylish Regency Apartment in Camden", 627, 5, 194, "Awesome photos on Instagram", 299, 1,
        "Equipment, 1 ticket included", "London's Amazing Palaces & Parliament", 104, 3, "",
        "Photoshooting in London Secret Corners", 321, 2.5, "Equipment included",
        "Paddleboard Regent's Park & London Zoo", 228, 1.5, "Drinks, Equipment included",
        "Beautiful days London Photoshoot", 266, 2, "Equipment included") };
    return AirBnBProperty;
  }
}