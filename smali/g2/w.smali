.class public final synthetic Lg2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/e0$b;


# instance fields
.field public final synthetic a:Lg2/e0;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lg2/e0;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/w;->a:Lg2/e0;

    iput p2, p0, Lg2/w;->b:F

    return-void
.end method


# virtual methods
.method public final a(Lg2/i;)V
    .locals 2

    iget-object v0, p0, Lg2/w;->a:Lg2/e0;

    iget v1, p0, Lg2/w;->b:F

    invoke-static {v0, v1, p1}, Lg2/e0;->d(Lg2/e0;FLg2/i;)V

    return-void
.end method
