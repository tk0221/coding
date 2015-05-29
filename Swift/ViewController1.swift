//
//  ViewController.swift
//  SwiftApp
//
//  Created by Hoon Kim on 2015. 5. 27..
//  Copyright (c) 2015년 Taehun Kim. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    var count = 0;
    var label:UILabel!
    
    override func viewDidLoad(){
        super.viewDidLoad()
        
        //Label
        var label = UILabel()
        label.frame = CGRectMake(150, 150, 60, 60)
        label.text = "0"
        
        self.view.addSubview(label)
        self.label = label
        
        var button = UIButton()
        button.frame = CGRectMake(150, 250, 60, 60)
        button.setTitle("Click", forState: .Normal)
        button.setTitleColor(UIColor.blueColor(), forState: .Normal)
        self.view.addSubview(button)
        
        var button2 = UIButton()
        button2.frame = CGRectMake(150, 350, 60, 60)
        button2.setTitle("count--", forState: .Normal)
        button2.setTitleColor(UIColor.brownColor(), forState: .Normal)
        self.view.addSubview(button2)
        
        button.addTarget(self, action: "incrementCount", forControlEvents: UIControlEvents.TouchUpInside)
        button2.addTarget(self, action: "decrementCount", forControlEvents: UIControlEvents.TouchUpInside)
        
    }
    func incrementCount(){
        self.count++
        self.label.text = "\(self.count)"
    }
    func decrementCount(){
        self.count--
        self.label.text = "\(self.count)"
    }
    
}

