.class public final synthetic Lbc/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/IntFunction;


# instance fields
.field public final synthetic a:Lbc/y0;


# direct methods
.method public synthetic constructor <init>(Lbc/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/x0;->a:Lbc/y0;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbc/x0;->a:Lbc/y0;

    invoke-virtual {v0, p1}, Lbc/y0;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
