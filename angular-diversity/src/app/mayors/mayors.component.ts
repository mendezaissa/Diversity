import { Component, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-mayors',
  templateUrl: './mayors.component.html',
  styleUrls: ['./mayors.component.css']
})
export class MayorsComponent implements OnInit {

  constructor(private renderer: Renderer2) { }

  renderExternalScript(src: string): HTMLScriptElement {
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = src;
    script.async = true;
    script.defer = true;
    this.renderer.appendChild(document.body, script);
    return script;
  }

  ngOnInit(): void {
    this.renderExternalScript('https://public.tableau.com/javascripts/api/viz_v1.js').onload = () => {
    }
  }

}
